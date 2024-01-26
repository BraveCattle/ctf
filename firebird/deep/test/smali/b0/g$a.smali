.class public Lb0/g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb0/g;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lb0/g;


# direct methods
.method public constructor <init>(Lb0/g;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lb0/g$a;->c:Lb0/g;

    iput-object p2, p0, Lb0/g$a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lb0/g$a;->c:Lb0/g;

    iget-object v0, v0, Lb0/g;->d:Lb0/f$c;

    iget-object v1, p0, Lb0/g$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lb0/f$c;->a(Ljava/lang/Object;)V

    return-void
.end method
