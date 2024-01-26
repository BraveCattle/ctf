.class public abstract Landroidx/fragment/app/d;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Landroidx/fragment/app/c;


# instance fields
.field public b:Landroidx/fragment/app/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/fragment/app/c;

    invoke-direct {v0}, Landroidx/fragment/app/c;-><init>()V

    sput-object v0, Landroidx/fragment/app/d;->c:Landroidx/fragment/app/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/d;->b:Landroidx/fragment/app/c;

    return-void
.end method


# virtual methods
.method public abstract a()Z
.end method
