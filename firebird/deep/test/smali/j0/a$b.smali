.class public Lj0/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lj0/a;


# direct methods
.method public constructor <init>(Lj0/a;)V
    .locals 0

    iput-object p1, p0, Lj0/a$b;->b:Lj0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lj0/a$b;->b:Lj0/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj0/a;->s(I)V

    return-void
.end method
