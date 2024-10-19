.class public Lr0/m$a;
.super Lr0/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/m;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lr0/g;


# direct methods
.method public constructor <init>(Lr0/m;Lr0/g;)V
    .locals 0

    iput-object p2, p0, Lr0/m$a;->a:Lr0/g;

    invoke-direct {p0}, Lr0/j;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lr0/g;)V
    .locals 1

    iget-object v0, p0, Lr0/m$a;->a:Lr0/g;

    invoke-virtual {v0}, Lr0/g;->y()V

    invoke-virtual {p1, p0}, Lr0/g;->v(Lr0/g$d;)Lr0/g;

    return-void
.end method
